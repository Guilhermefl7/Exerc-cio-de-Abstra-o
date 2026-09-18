# Exercicio POO - Banda Escolar

Aluno: Guilherme e Alessa

Perguntas

1. Quantas classes concretas o texto descreve? Quais sao?
O texto descreve duas classes concretas de instrumentos: `Violao` e `Bateria`.

2. Quais atributos aparecem em TODOS os instrumentos?
Os atributos comuns sao `nome`, `material` e `afinado`. Eles ficam na classe abstrata `InstrumentoMusical`.

3. Qual atributo e exclusivo de cada instrumento?
No `Violao`, o atributo exclusivo e a quantidade de cordas. Na `Bateria`, o atributo exclusivo e a quantidade de tambores.

4. Qual comportamento e diferente e qual e igual para todos?
O comportamento diferente e `tocar()`, porque cada instrumento produz um som diferente. Por isso, ele e abstrato. O comportamento igual e `afinar()`, porque em todos os instrumentos ele apenas muda o estado para afinado.

5. Qual recurso do Java impede criar um instrumento generico?
O uso de uma classe `abstract` impede que `InstrumentoMusical` seja instanciada diretamente.

6. Que tipo a List<?> deve ter?
A lista deve ser `List<InstrumentoMusical>`, pois assim e possivel guardar objetos de `Violao`, `Bateria` e futuros instrumentos que herdem dessa classe, usando polimorfismo e sem `instanceof` ou cast.

Estrutura
model/
InstrumentoMusical.java
Violao.java
Bateria.java
app/
TesteBanda.java





