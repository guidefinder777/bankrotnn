--
-- PostgreSQL database dump
--

-- Dumped from database version 10.5
-- Dumped by pg_dump version 10.5

-- Started on 2018-10-01 02:16:28

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12924)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2823 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 197 (class 1259 OID 25028)
-- Name: contact; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.contact (
    id integer NOT NULL,
    last_name character varying(256),
    first_name character varying(256),
    middle_name character varying(256),
    last_name_accusative character varying(256),
    first_name_accusative character varying(256),
    middle_name_accusative character varying(256),
    previous_names character varying(512),
    date_of_birth date,
    actual_address character varying(1024),
    comment text,
    series character varying(64),
    number character varying(64),
    issued_by character varying(1024),
    issued_date date,
    subdivision_code character varying(64),
    place_of_birth character varying(1024),
    reg_address_index integer,
    reg_address_region character varying(1024),
    reg_address_district character varying(1024),
    reg_address_city character varying(1024),
    reg_address_settlement character varying(1024),
    reg_address_street character varying(1024),
    reg_address_street_type integer,
    reg_address_house character varying(64),
    reg_address_corp character varying(64),
    reg_address_flat character varying(64),
    gender character varying(32),
    created_date time with time zone NOT NULL
);


ALTER TABLE public.contact OWNER TO postgres;

--
-- TOC entry 199 (class 1259 OID 25039)
-- Name: contact_email; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.contact_email (
    id integer NOT NULL,
    contact_id integer NOT NULL,
    email character varying(128),
    main boolean
);


ALTER TABLE public.contact_email OWNER TO postgres;

--
-- TOC entry 198 (class 1259 OID 25037)
-- Name: contact_email_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.contact_email_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.contact_email_id_seq OWNER TO postgres;

--
-- TOC entry 2824 (class 0 OID 0)
-- Dependencies: 198
-- Name: contact_email_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.contact_email_id_seq OWNED BY public.contact_email.id;


--
-- TOC entry 196 (class 1259 OID 25026)
-- Name: contact_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.contact_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.contact_id_seq OWNER TO postgres;

--
-- TOC entry 2825 (class 0 OID 0)
-- Dependencies: 196
-- Name: contact_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.contact_id_seq OWNED BY public.contact.id;


--
-- TOC entry 201 (class 1259 OID 25052)
-- Name: contact_phone; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.contact_phone (
    id integer NOT NULL,
    contact_id integer NOT NULL,
    phone character varying(512),
    mail boolean,
    phone_type character varying(36)
);


ALTER TABLE public.contact_phone OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 25050)
-- Name: contact_phone_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.contact_phone_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.contact_phone_id_seq OWNER TO postgres;

--
-- TOC entry 2826 (class 0 OID 0)
-- Dependencies: 200
-- Name: contact_phone_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.contact_phone_id_seq OWNED BY public.contact_phone.id;


--
-- TOC entry 2684 (class 2604 OID 25031)
-- Name: contact id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contact ALTER COLUMN id SET DEFAULT nextval('public.contact_id_seq'::regclass);


--
-- TOC entry 2685 (class 2604 OID 25042)
-- Name: contact_email id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contact_email ALTER COLUMN id SET DEFAULT nextval('public.contact_email_id_seq'::regclass);


--
-- TOC entry 2686 (class 2604 OID 25055)
-- Name: contact_phone id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contact_phone ALTER COLUMN id SET DEFAULT nextval('public.contact_phone_id_seq'::regclass);


--
-- TOC entry 2690 (class 2606 OID 25044)
-- Name: contact_email contact_email_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contact_email
    ADD CONSTRAINT contact_email_pkey PRIMARY KEY (id);


--
-- TOC entry 2692 (class 2606 OID 25060)
-- Name: contact_phone contact_phone_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contact_phone
    ADD CONSTRAINT contact_phone_pkey PRIMARY KEY (id);


--
-- TOC entry 2688 (class 2606 OID 25036)
-- Name: contact contact_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contact
    ADD CONSTRAINT contact_pkey PRIMARY KEY (id);


--
-- TOC entry 2693 (class 2606 OID 25045)
-- Name: contact_email fk_contact; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contact_email
    ADD CONSTRAINT fk_contact FOREIGN KEY (contact_id) REFERENCES public.contact(id);


--
-- TOC entry 2694 (class 2606 OID 25061)
-- Name: contact_phone fk_contact; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contact_phone
    ADD CONSTRAINT fk_contact FOREIGN KEY (contact_id) REFERENCES public.contact(id);


-- Completed on 2018-10-01 02:16:29

--
-- PostgreSQL database dump complete
--

