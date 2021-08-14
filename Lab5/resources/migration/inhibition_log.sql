-- Table: public.inhibition_log

-- DROP TABLE public.inhibition_log;

CREATE TABLE public.inhibition_log
(
    log_id bigint NOT NULL DEFAULT nextval('inhibition_log_log_id_seq'::regclass),
    state character varying COLLATE pg_catalog."default",
    name character varying COLLATE pg_catalog."default",
    specie character varying COLLATE pg_catalog."default",
    CONSTRAINT inhibition_log_pkey PRIMARY KEY (log_id)
)

TABLESPACE pg_default;

ALTER TABLE public.inhibition_log
    OWNER to postgres;