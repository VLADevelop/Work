// First level: 1. Напишите следующую функцию, которая принимает
// некий массив данных. Если в массиве только строковый тип данных, то
// функция должна находить самую длинную строку и возвращать массив из
// двух элементов - эту строку и её индекс исходном массиве
// Если в массиве только цифры, то функция должна находить самую
// большую цифру и возвращать массив из двух элементов - из этой цифры
// и её индекса в исходном массиве
// Во всех остальных случаях (если там другие типы данных или же они
// смешаны), то функция должна возвращать массив из двух элементов -
// первый это строка 'неверный тип данных в массиве', а второй элемент
// это общая длина массива.


// (Необязательная задача) Напишите функцию которая будет принимать три
//  массива с любыми данными и объединять их в один, новый массив и
//  возвращать его.В зависимости от типа данных вы должны упорядочить
// данные.Сначала добавляйте только строки, затем цифры, затем булевы
// значения, все остальные значения могут быть в произвольном порядке
// добавлены далее.
// Пример как должна работать функция.
// let result toHardThreeOrder(['привет', true, 65],[3, [], false], ['js', 'java', 'script', 'redButton'])
// console.log(result)// ['привет', js', 'java', 'script', 'redButton', 3, 65, true, false, []]

// let array1 = ["gvg", "hhjgjgj", "bjhhj"];
// let array2 = [12, 3, 58, 9, -6];
// let array3 = [true, false];

// let newValueMassiv1 = (arr) => {
//   if (checkTypeInArray(arr, "string")) {
//     return findMaxStringInArray(arr);
//   }
//   if (checkTypeInArray(arr, "number")) {
//     return findMaxNumberInArray(arr);
//   }

//   return ["Error Data", arr.length];
// };


// console.log(newValueMassiv1(array1));
// console.log(newValueMassiv1(array2));
// console.log(newValueMassiv1(array3));

// function checkTypeInArray(array, type) {
//   let flag = true;
//   array.forEach((element) => {
//     if (typeof element !== type) {
//       flag = false;
//     }
//   });
//   return flag;
// }


// function findMaxStringInArray(array) {
//     let stringValue = "";
//     let stringIndex = 0;
  
//     array.forEach((value, index) => {
//       if (value.length > stringValue.length) {
//         stringValue = value;
//         stringIndex = index;
//       }
//     });
  
//     return [stringValue, stringIndex];
//   }
  
//   function findMaxNumberInArray(array) {
//     let numberValue = 0;
//     let numberIndex = 0;
  
//     array.forEach((value, index) => {
//       if (value > numberValue) {
//         numberValue = value;
//         numberIndex = index;
//       }
//     });
//     return [numberValue, numberIndex];
//   }



let one = ["привет", true, 65];
let two = [3, [], false];
let three = ["js", "java", "script", "redButton"];

function resultFilter(arr1, arr2, arr3) {
  let toHardThreeOrder = [].concat(one, two, three);

  let a = toHardThreeOrder.filter((n) => {
    return typeof n == "string";
  });

  let b = toHardThreeOrder.filter((n) => {
    return typeof n == "number";
  });

  let c = toHardThreeOrder.filter((n) => {
    return typeof n == "boolean";
  });

  let d = toHardThreeOrder.filter((n) => {
    return (
      typeof n !== "boolean" && typeof n !== "number" && typeof n !== "string"
    );
  });

  return [...a, ...b, ...c, ...d];
}

console.log(resultFilter(one, two, three));