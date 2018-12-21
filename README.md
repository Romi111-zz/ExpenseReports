# Expense Reports

The goal of this project is to learn Java, Maven, Spring and Hibernate while creating a web app to manage business expenses reports.

**Status of the project**

Open, with back-end in progress and front-end to be started.

**Testing**

Create a new business trip in the database:


```
$ curl 'localhost:8080/expensesmanagement/nuovatrasferta?Nome=Brasile&DataInizio=30/11/2018&DataFine=03/12/2018'
```

Create a new expense linked to the business trip above:

```
$ curl 'localhost:8080/expensesmanagement/nuovaspesa?ID_TrasfertaCollegata=1&DataSpesa='30/11/2018'&Descrizione='Cena'&Importo=100'
```

Get the list of all the business trips

```
$ curl 'localhost:8080/expensesmanagement/getlistatrasferte'
```

Get the list of all the expenses

```
$ curl 'localhost:8080/expensesmanagement/getlistaspese'
```

**Start date**

December 15, 2018
