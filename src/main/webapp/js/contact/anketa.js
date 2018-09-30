function mask() {
    $('.select2-tags').select2({tags: true});
    $('.datepicker').datetimepicker({locale: 'ru', format: 'DD.MM.YYYY'});
    $('input[name="phone[]"]').mask('+7 (999) 999-9999');
    $('.select2-tags').select2({tags: true});
    $('.datepicker').datetimepicker({locale: 'ru', format: 'DD.MM.YYYY'});
    $('.phone').mask('+7 (999) 999-9999');
    $('input[name="series"]').mask('00 00');
    $('input[name="number"]').mask('000000');
    $('input[name="subdivision_code"]').mask('000-000');
    $('input[name="snils"]').mask('000-000-000 00');
    $('input[name="inn"]').mask('000000000000');
    $('input[name="reg_address_index"]').mask('000000');
}

$(document).ready(function () {
    mask();

    var form = $('.js_contacts_edit_form');

    form.on('submit', function (e) {
        e.preventDefault();

        var phones = [];
        form.find('input.phone').each(function () {
            phones.push($(this).val());
        });
        var types = [];
        form.find('select.type').each(function () {
            types.push($(this).val());
        });
        var emails = [];
        form.find('input.email').each(function () {
            emails.push($(this).val());
        });

        var post_object = {
            method: 'contact.edit_contact',
            id: form.find('input[name="id"]').val(),
            last_name: form.find('input[name="last_name"]').val(),
            first_name: form.find('input[name="first_name"]').val(),
            middle_name: form.find('input[name="middle_name"]').val(),
            last_name_accusative: form.find('input[name="last_name_accusative"]').val(),
            first_name_accusative: form.find('input[name="first_name_accusative"]').val(),
            middle_name_accusative: form.find('input[name="middle_name_accusative"]').val(),
            gender: form.find('[name="gender"]:checked').val(),
            previous_names: form.find('input[name="previous_names"]').val(),
            date_of_birth: form.find('input[name="date_of_birth"]').val(),
            actual_address: form.find('input[name="actual_address"]').val(),
            comment: form.find('input[name="comment"]').val(),
            snils: form.find('input[name="snils"]').val(),
            inn: form.find('input[name="inn"]').val(),
            series: form.find('input[name="series"]').val(),
            number: form.find('input[name="number"]').val(),
            issued_by: form.find('input[name="issued_by"]').val(),
            issued_date: form.find('input[name="issued_date"]').val(),
            subdivision_code: form.find('input[name="subdivision_code"]').val(),
            place_of_birth: form.find('input[name="place_of_birth"]').val(),

            reg_address_index: form.find('input[name="reg_address_index"]').val(),
            reg_address_region: form.find('input[name="reg_address_region"]').val(),
            reg_address_district: form.find('input[name="reg_address_district"]').val(),
            reg_address_city: form.find('input[name="reg_address_city"]').val(),
            reg_address_settlement: form.find('input[name="reg_address_settlement"]').val(),
            reg_address_street: form.find('input[name="reg_address_street"]').val(),
            reg_address_street_type: form.find('select[name="reg_address_street_type"]').val(),
            reg_address_house: form.find('input[name="reg_address_house"]').val(),
            reg_address_corp: form.find('input[name="reg_address_corp"]').val(),
            reg_address_flat: form.find('input[name="reg_address_flat"]').val(),

            email: emails,
            phone: phones,
            type: types,
            main_phone: form.find('[name="main_phone"]:checked').val(),
            main_email: form.find('[name="main_email"]:checked').val(),
            snils_images: '',
            inn_images: '',
            passport_images: '',
        };

        $.ajax
        ({
            type: "POST",
            url: '/api/contact/save',
            dataType: 'json',
            async: false,
            contentType: "application/json",
            data: JSON.stringify(post_object),
            success: function () {
                console.log("okey!");
            },
            error: function () {
                alert('eerror');
            }
        });

        return false;
    });

    var tplEmail = [
        '<div class="form-group row {class}">',
        '<div class="col-sm-4">',
        '<input type="text" class="form-control email" name="email[{id}]" id="email-{id}" value="" placeholder="E-mail">',
        '<div class="js_main_email_error"></div>',
        '</div>',
        ' <div class="radio col-sm-2">',
        '<label>',
        '<input type="radio" name="main_email" value="{id}">Основной',
        '</label>',
        '</div>',
        '<div class="col-sm-1">',
        '<button type="button" class="btn btn-danger remove">',
        '<i class="glyphicon glyphicon-trash"></i>',
        '</button>',
        '</div>',
        '</div>',
    ].join('');

    $(function () {
        var tplPhone = $('#phoneTpl').html();

        $('.add-field').on('click', function (e) {
            e.preventDefault();
            var target = $(this).data('target');
            var count = $(target).length;
            var _tpl = target == '.email' ? tplEmail : tplPhone;
            var clazz = target == '.email' ? 'email-block' : 'phone-block';
            $(target + '-block:last').after(_tpl.replace(/{id}/g, count).replace('{class}', clazz));

            mask();
        });

        $('.js_contacts_edit_form').on('click', '.remove', function () {
            $(this).closest('.form-group').remove();
        });
    });

    var paramId = getUrlParameter('id');

    if (paramId) {
        $.get("/api/contact/get?id=" + paramId, function (data) {
            if (data) {
                $.each(data, function (k, v) {
                    if (k == 'gender') {
                        $('#' + v).prop("checked", true);
                    } else if (k == 'email') {
                        $.each(v, function (ke, ve) {
                            if(ke>0){
                                $('[data-target=".email"]').click();
                            }
                            $('#email-' + (ke)).val(ve);
                        });
                    } else {
                        $('[name="' + k + '"]').val(v);
                    }
                });
            }
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


});


var getUrlParameter = function getUrlParameter(sParam) {
    var sPageURL = decodeURIComponent(window.location.search.substring(1)),
        sURLVariables = sPageURL.split('&'),
        sParameterName,
        i;

    for (i = 0; i < sURLVariables.length; i++) {
        sParameterName = sURLVariables[i].split('=');

        if (sParameterName[0] === sParam) {
            return sParameterName[1] === undefined ? true : sParameterName[1];
        }
    }
};