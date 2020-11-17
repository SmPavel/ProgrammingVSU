#### [Task1](./src/vsu/pustoslov/task1/Task1.java)

10\) Известны длины сторон a, b, c треугольника.
Вычислить высоты этого треугольника.
***
#### [Task2](./src/vsu/pustoslov/task2/Task2.java)

14\) Проверить, можно ли вписать в треугольник 
со сторонами A, B, C круг с радиусом R 
(заодно проверить возможность существования такого 
треугольника).
***
#### [Task3](./src/vsu/pustoslov/task3)

>Условный оператор + функции + классы + перечисления 
>\+ декомпозиция задачи (разбиение на подзадачи) + формальный подход.

На изображениях ниже (для каждого варианта свое) приводится 
часть координатной плоскости (-10 <= x <= 10, -10 <= y <= 10) 
с графиками функций (парабола, линия) и фигурами (круг, прямоугольник). 
Размер одной клетки сетки – 1 (единица). 
Таким образом параметры функций и фигур 
можно однозначно определить из рисунка.

Области, на которые разбивается плоскость графиками и контурами фигур, 
закрашены разными цветами (белый, серый, желтый, оранжевый, голубой, зеленый). 
Необходимо реализовать программу, которая для точки (x, y) 
определяет цвет области, в которую данная точка попадает. 
Будем считать, что если точка (x, y) попадает на линию 
графика функции или контура фигуры, то правильным 
ответом будет цвет любой соседней области. 
Также стоит заметить, что некоторые комбинации линий 
предполагают их пересечение за пределами изображенного 
на рисунке фрагмента плоскости поэтому, 
чтобы исключить неопределенность ответа, 
допустимыми значениями (x, y) являются только такие, 
которые попадают в приведенное изображение.

В программе должна быть реализована функция (статический метод), 
которая для точки (x, y) возвращает 
цвет точки на изображении.

В методе Main необходимо для несколько заранее выбранных 
точек на рисунке (обязательно должны быть охвачены все области, 
на которые разбивается плоскость) распечатать результат, 
который возвращает getColor (и самостоятельно убедиться, 
что данная функция работает корректно). 
Также программа должна запрашивать координаты 
одной произвольной точки, и для нее 
таким же образом печатать результат.

![Number 9](https://sun9-45.userapi.com/Q_tWqBuWZsyr0XYnf2tbqAI4hMcvX4K5kFgTFA/8yhYHZewD-4.jpg)
***
#### [Task4](./src/vsu/pustoslov/task4/Task4.java)

27*\) Дано натуральное k. Напечатать k-ую цифру 
последовательности 12345678910111213…,
в которой выписаны подряд все натуральные числа.
Строки и массивы не использовать.
***
#### [Task5](./src/vsu/pustoslov/task5/Task5.java)

Напечатать в консоле следующую фигуру.

![Number9](https://sun9-30.userapi.com/X0lxDS7OFGvkduwDpAP-jC5BWdXK9VWS6l3q_w/sGU4nfHqcnQ.jpg)

Для печати реализовать отдельную функцию с параметрами.

Для различных вариантов могут быть заданы следующие параметры:

+ h – высота фигуры

+ w – ширина фигуры

+ s – размер фигуры

Для каждого варианта указаны допустимые значения данных параметров, 
а также в скобках приведены значения 
параметров для приведенного примера.

*Запрещено использовать строки, массивы, а также 
управлять курсором, можно только использовать циклы, 
условный оператор, а также Console.Write(...) и Console.WriteLine(…).*
***
#### [Task6](./src/vsu/pustoslov/task6)

При некоторых заданных x (допустимые значения x – интервал (-R, R)), 
n и e, определяемых вводом, вычислить:

1) сумму n слагаемых заданного вида;

2) сумму тех слагаемых, которые по абсолютной величине больше e;

3) сумму тех слагаемых, которые по абсолютной величине больше e/10;

4) значение функции с помощью методов Math.

При вычислениях необходимо выразить an (n-ый член ряда) 
как зависимость от n, an-1 и x, т.е. виде an = f(n, an-1, x). 
Другие варианты решения не принимаются.

Использовать только 1 цикл.

![Number_19](https://sun9-50.userapi.com/GvItSwr0nHVc6QsEuO7h2nmmK8jjfjp1mm8m0g/ZMNv2fOrfks.jpg)
***
#### [Task7](./src/vsu/pustoslov/task7)

13\) Вводится массив целых чисел. 
Посчитать количество элементов массива, 
больших или равных среднему арифметическому 
элементов массива, отличных от минимального 
(если все элементы массива одинаковые, то ответ – 0).

##### Важно!

+ Для вычислений использовать отдельную функцию solution 
(необходимые параметры и возвращаемое значение определяются 
условием конкретного варианта задачи). 
В некоторых задачах потребуются также дополнительные функции.

+ Заранее придумать не менее 10 различных тестов, 
охватывающих как типичные, так и все возможные граничные 
(наиболее невероятные и показательные) ситуации. 
Программа при запуске должна прогонять эти тесты 
(для каждого теста распечатывать входной массив и результат), 
а также предлагать пользователю задать произвольный массив 
в качестве входных данных.

+ Для ввода и, если необходимо, вывода одномерных массивов 
разработать отдельные функции.
***
#### [Task8](./src/vsu/pustoslov/task8)

17\) Создать новый квадратный двумерный массив 
из переданного двумерного массива, 
обрезав от последнего лишние строки или столбцы, 
т.е. такие, для которых нет соответствующих столбцов или строк.

##### Важно!

Входные данные для этой задачи должны читаться из текстового файла, 
а выходные – записываться в текстовый файл.
 
 Данная задача должна быть оформлена двумя способами:
 
 1) в виде консольного приложения с разбором параметров командной строки,
 
 2) в виде оконного приложения, где двумерный массив 
 можно задать в JTable. При этом должна быть возможность 
 загрузить данный из файла в JTable 
 (реализованная в виде двух функций: чтение данных из файла
 в двумерный массив и отображение двумерного массива в JTable),
 а также сохранить данные из JTable в файл (реализованная в виде двух 
 функций: чтение данных из JTable в двумерный массив 
 и запись двумерного массива в файл).
 
 *Функции, реализующие логику задачи и чтение 
 / запись данных из файлов / 
 в файлы, должны быть оформлены в виде отдельного модуля 
 (в отдельном файле). Этот модуль без каких-либо изменений 
 должен использоваться в двух программах: с консольным интерфейсом 
 (файлы для чтения / записи задаются в параметрах командной строки) 
 и оконным интерфейсом.*

 
 + Заранее придумать не менее 5 различных тестов, 
 охватывающих как типичные, так и все возможные 
 граничные (наиболее невероятные и показательные) ситуации. 
 (Сохранить в текстовых файлах input01.txt, input02.txt и т. д.)
 
 + Решение, естественно, должно быть оформлено в виде отдельной функции. 
 В реализации обязательно использовать вспомогательные функции 
 (в этой задаче, какие именно вспомогательные функции использовать, 
 не расписано, вы должны самостоятельно решить, 
 какие именно будут удобны для вашего варианта).
 
 + В данных задачах, если явно не оговорено иное, предполагается, 
 что все строки двумерного массива имеют одинаковую длину, 
 т.е. массив является прямоугольным. В реализации разрешено 
 также использовать вместо прямоугольных массивов ступенчатые массивы 
 (т.е. массивы массивов или списки списков). 
 В этом случае необходимо дополнительно реализовать 
 функцию проверки «прямоугольности» ступенчатого массива, 
 которую применять для проверки корректности данных перед обработкой.

