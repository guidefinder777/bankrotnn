$(document).ready(function () {

    var getGrid = function () {
        $.get("/api/contact/find", function (data) {
            var $table = $('.users_list');
            $table.find('tbody').find('tr').not('.tr-template').remove();
            var $row = $table.find('.tr-template');

            $.each(data.items, function (k, v) {
                var $clone = $row.clone();
                $clone.find('td:eq(0)').find('a').text(v.fullname);
                $clone.find('td:eq(0)').find('a').attr('href', '/contact/anketa.html?id=' + v.id);
                $clone.find('td:eq(1)').text(v.mainEmailValue);
                $clone.find('td:eq(2)').text(v.mainPhoneValue);

                $clone.find('td:eq(5)').find('.js_edit_contact').attr('href', '/contact/anketa.html?id=' + v.id);
                ;
                $clone.find('td:eq(5)').find('.js_remove_contact').attr('data-fio', v.fullname);
                $clone.find('td:eq(5)').find('.js_remove_contact').attr('data-id', v.id);

                $clone.removeClass('hide');
                $clone.removeClass('tr-template');
                $table.append($clone);
            });

            $('.js_remove_contact').off('click').on('click', function () {
                if (confirm('Вы действительно хотите удалить контакт ' + $(this).attr('data-fio') + '?')) {

                    $.ajax
                    ({
                        type: "DELETE",
                        url: '/api/contact/delete?id=' + $(this).attr('data-id'),
                        async: false,
                        success: function () {
                            console.log("okey!");
                            getGrid();
                        },
                        error: function () {
                            alert('eerror');
                        }
                    });
                }
            });
        })
            .done(function () {
                console.log("second success");
            })
            .fail(function () {
                console.log("error");
            })
            .always(function () {
                console.log("finished");
            });
    }

    getGrid();
});