-- Table: public.cages

-- DROP TABLE public.cages;

CREATE TABLE public.cages
(
    "number" integer NOT NULL,
    area double precision,
    condition character varying COLLATE pg_catalog."default",
    vacant boolean,
    animal_name character varying COLLATE pg_catalog."default",
    animal_specie character varying COLLATE pg_catalog."default",
    CONSTRAINT cages_pkey PRIMARY KEY ("number")
)

TABLESPACE pg_default;

ALTER TABLE public.cages
    OWNER to postgres;