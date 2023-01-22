# Comandos básicos:

## Ver todos os bancos

```
shows databases
show dbs
```

## Ver todas as coleções

```
shows collections
show tables
```

## Selecionar um banco

```
use NOME_DO_BANCO
```

## Selecionando todos os registros

```javascript
// Onde aluno é o nome da Collection
db.aluno.find()
```

## Selecionando todos os registros que o tenham nome "Paulo"

```javascript
// Onde aluno é o nome da Collection
db.aluno.find({ nome: "Paulo" })
```

## Selecionando todos os registros que o tenham _id = "63c5d87f49c06b2b84e59025"

```javascript
// Onde aluno é o nome da Collection
db.aluno.find({ _id: ObjectId("63c5d87f49c06b2b84e59025") })
```

## Selecionando todos os registros que o tenham nome contendo "Márcia" ou nomeCompleto contendo "Márcia"

```javascript
// Onde aluno é o nome da Collection
db.aluno.find({ $or: [ { nome: /Márcia/ }, { nomeCompleto: /Márcia/ } ] })
```

## Selecionando todos os registros que o tenham sobrenome "Reis" e idade maior que 30

```javascript
// Onde aluno é o nome da Collection
db.aluno.find({ $and: [ { sobrenome: "Reis" }, { idade: { $gt: 30 } } ] })
```

## Inserindo um registro

```javascript
// Onde aluno é o nome da Collection
db.aluno.insertOne({ "nomeCompleto": "Ana Maria da Silva", sexo: "feminino" })
```

## Inserindo vários registros

```javascript
// Onde aluno é o nome da Collection
db.aluno.insertMany([ { nome: "José", sobrenome: "Pereira" }, { nome: "Márcia", sobrenome: "Abrãao" } ])
```

## Atualizando um registro

```javascript
// Onde aluno é o nome da Collection
db.aluno.updateOne({ _id: ObjectId("63c5d87f49c06b2b84e59025") }, { $set: { sobrenome: "Silva", idade: 45 } })
```

## Atualizando vários registros

```javascript
// Onde aluno é o nome da Collection
db.aluno.updateMany( { sobrenome: "Reis" }, { $set: { sobrenome: "Reis dos Santos" } } )
```

## Removendo um registro

```javascript
// Onde aluno é o nome da Collection
db.aluno.deleteOne({ _id: ObjectId("63c5d87f49c06b2b84e59025") })
```
