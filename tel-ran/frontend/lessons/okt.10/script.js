// console.log('Hello world!');


// let i = 3;
// while (i) {
//     console.log(i--);   
// }
// console.log('-------------')
// let j = 0;
// while (++<5) {
//     console.log(j);
// }

// let i= 10;
//     while (i-->=5) {
//         console.log(i);
//     }

// for (let i = 9; i >= 4; i--) {
//     console.log(i);
// }

// function wachMashine( thing1< thing2 ) {
//     console.log('washing:', thing1, thing2);
// }

// wachMashine('кросовки', 'шляпа');

// wachMashine('рубашки', 'футболки');

// function sumAandb(a,b) {
//     let sumAandb = a + b;
//     console.log(sumAB);
// }
// sumAB(15;10)

// function showMessage() {
//     let massage =  'Hello World';
//     console.log(massage)
//     return 'showMessage is called'
//     showMessage(resultShowMessageReturn );
// }

// function sayHello(firstName = 'Unknow User', secondName = 'User') {
//     console.log('Hello ${firstName}')
// }

// let wallet = 100; // 

// function paid(orderSum) {

//     if (wallet >= orderSum) {
//         chageWallet(orderSum) {
//         return 'Bought'
//         }
//         return 'No enough money';
//     }
//     function chageWallet(changeSun) {
//         wallet = wallet - changeSun;
//         console.log('Balance: ${wallet}');
//     }
// }
// console.log(paid(40));
// console.log(paid(20));
// console.log(paid(50));

// function summ(a,b) {
//     return a + b;

// }

// let myMoney = summ(500, 200) 
// let myMoney = summ(15, 5);

// let 
// {
//     console.log(myMoney);

// }

// Заполните массив 10-ю иксами с помощью цикла

//
// Данн массив[1, 2, 4, -40, -3, 8, 7, 0, -5, 18, 12];
// Вывести в консоль диапазон от 0 до 10

// let arr1 = [1, 2, 4, -40, -3, 8, 7, 0, -5, 18, 12];

// let rangeFilter = function (arr, min, max) {
//   let arrNeu = [];
//   for (let i = 0; i < arr.length; i++) {
//     if (arr[i] > min && arr[i] < max) {
//       arrNeu.push(arr[i]);
//     }
//   }
//   return arrNeu;
// };
// console.log(rangeFilter(arr1, -10, 10));

// Сделайте функцию howManyToTen, которая будет принимать массив с числами и возвращать 
// количество элементов массива которых нужно сложить, начиная с первого, чтобы получить число
// больше десяти.

// let arr = [15, 2, 4, -3, 8, 7, 0, -5, 18, 12];

// let howManyToTen = function (arr) { // 1 получили масив в функции
//   let sum = 0; //2 заводим сумму
//   for (let i = 0; i < arr.length; i++) { //3 итерируем массив с 0 индекса
//     sum += arr[i]; // 4 считаем сумму
//     if (sum > 10) { // если сумма больше 10
//       return i+1; // выходим из функции и возвращаем текущую итерацию + 1
//     } // то есть количество элементов массива которые мы сложили
//   }
//   return 'сумма не больше 10'; // если массив не дает суммы > 10 то 
// }; // просто возвращаем эту строку
// console.log(howManyToTen(arr)); // вызов функции с масива

// Создайте массив arr с элементами 2, 5, 3, 9. Умножьте первый элемент массива на второй, а третий элемент на четвертый. 
// Результаты сложите, присвойте переменной result. Выведите на экран значение этой переменной.

// let arr = [2, 5, 3, 9];

//  let res = (arr[0]*arr[1])+(arr[2]*arr[3])
//  console.log(res)


//  let arrToCalc = arr =>{
//     let acum  = 0;
//     let arr1 = [];
//     let arrToMult = [];
//     for (let i = 0; i < arr.length; i++) {
//         if (i%2!==0){
//             arr1.push([arr[i-1],arr[i]])
//         }        
//     }
//     console.log(arr1)
    
// for (let i = 0; i < arr1.length; i++) {
//    arrToMult.push(arr1[i][0]*arr1[i][1])    
// }
// console.log(arrToMult)

// for (let i = 0; i < arrToMult.length; i++) {
//    acum+=arrToMult[i]
    
// }
// return acum;

//  }

// //[[2,5],[3,9]]
// arrToCalc([2, 5, 3, 9])

// console.log(arrToCalc([2, 5, 3, 9, 2, 3]))

// В переменной date лежит дата в формате '2025-12-31'. Преобразуйте эту дату в формат '31/12/2025'.

// let stringDate = '2025-12-31';

// let stringDateArray = stringDate.split("-"); // создание массива["2025", "12", "31"] 
// stringDateArray.reverse();
// console.log(stringDateArray);
// let stringDateUpdate = stringDateArray.join("/");
// //let stringDateUpdate = `${stringDateArray[2]}/${stringDateArray[1]}/${stringDateArray[0]}`;
// console.log(stringDateUpdate); 

// function formatDate(str) {
//     let stringDateArray = str.split("-"); // преобразовала в массив по разделетилю в -
//     stringDateArray.reverse(); //развернула массив
//     let stringDateUpdate = stringDateArray.join("/"); // объединила массив в сторку через /
//     return str
//        .split("-")
//        .reverse()
//        .join("/"); //цепочка методов // точка позволяет переносить строку кода // не нужны двже круглые скобки в цепочке методов
 
//     return stringDateUpdate; // вернули
//  }
//  console.log(formatDate("2022-10-19")); 
//  // let formatDate = str => str.split("-").reverse().join("/");
//  // console.log(formatDate("2022-10-19"));


//  Дана переменная str, в которой хранится какой-либо текст. 
// Реализуйте обрезание длинного текста по следующему принципу: если количество символов этого текста больше заданного в переменной n, 
// то в переменную result запишем первые n символов строки str и добавим в конец троеточие '...'. 
// В противном случае в переменную result запишем содержимое переменной str.

// let shortingString = function (string, max) {
//     if (string.length <= max) {
//       return string;
//     }
//     return string.slice(0, max) + "...";
    
//   };
//   console.log(shortingString("hello world", 20));
