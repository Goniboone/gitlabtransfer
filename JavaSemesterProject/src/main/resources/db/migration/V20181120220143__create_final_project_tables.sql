create table public.customer(
customer_id primary key serial not null constraint,
last_name varchar(35) not null,
first_name varchar(35) not null
)