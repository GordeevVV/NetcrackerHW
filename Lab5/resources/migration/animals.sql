-- Table: public.animals

-- DROP TABLE public.animals;

CREATE TABLE public.animals
(
    name character varying COLLATE pg_catalog."default" NOT NULL,
    specie character varying COLLATE pg_catalog."default" NOT NULL,
    cage_number integer,
    CONSTRAINT animals_pkey PRIMARY KEY (name),
    CONSTRAINT fk1 FOREIGN KEY (cage_number)
        REFERENCES public.cages ("number") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE public.animals
    OWNER to postgres;