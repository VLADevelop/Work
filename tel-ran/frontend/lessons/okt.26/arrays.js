// let users = [
//     "Вася", // 0
//     'Петя', // 1
//     "Маша", // 2
//   ];
  
//   let someUsers = users.filter(
//       item => item[3] === 'я'
//   );
  
//   let someUsers2 = users.filter(
//       function(item) {
//           return item[3] === 'я'
//       }
//   );
  
//   console.log(someUsers,someUsers2);


// function withOutArray(array, ...deleteData) {
// 	console.log(deleteData)
// }



// let someArray = ['ttt', 'fff', 555, true, false, undefined, null, 0, 5, 61, 1];
// withOutArray(someArray, null, 5, 1, false, 555);


// let someArray = ["ttt", "fff", 555, true, false, undefined, null, 0, 5, 61, 1];
// withOutArray(someArray, null, 5, 1, false, 555);

// function withOutArray(array, ...deleteData) {            //1. приходит два массива
//     let filteredArray = [...array];                        // 2. клонируем массив
//     for (let i = 0; i < deleteData.length; i++) {          // 3.перебор массива  DeleteData
//       filteredArray = filteredArray.filter(                // 4. фильтруем клон основного массива 
//           (item) => item !== deleteData[i]);               //  и перезаписуваем его без текущего символа в итерации deletData 
//     }                                                      // который нужно удалить
//   return filteredArray                                     // возвращаем
//   }
//    console.log(withOutArray(someArray,null, 5, 1, false, 555));


// function withOutArray(array, ...deleteData) {
//     //1. приходит два массива
// let filteredArray = [...array];                          // 2. клонируем массив
// deleteData.forEach((deleteItem) => {                      // 3.перебор массива  DeleteData
// filteredArray = filteredArray.filter(
//   // 4. фильтруем клон основного массива
// (item) => item !== deleteItem
// );
// });                                                    
 
//  //  и перезаписуваем его без текущего символа в итерации deletData
//  // который нужно удалить
// return filteredArray;                                // возвращаем
// }
// console.log(withOutArray(someArray, null, 5, 1, false, 555));


let someArray = ['ttt', 'fff', 555, true, false, undefined, null, 0, 5, 61, 1];
withOutArray(someArray, null, 5, 1, false, 555);

function withOutArray(array, ...deleteData) {
  let filteredArray = [...array];

  for (let i = 0; i < deleteData.length; i++) {
    filteredArray = filterClone(filteredArray, deleteData[i]);
  }
  return filteredArray;
}

function filterClone(arr, element) {
  let newArr = [];

  for (let i = 0; i < arr.length; i++) {
    if (element !== arr[i]) {
      newArr.push(arr[i]);
    }
  }
  return newArr;
}

console.log(withOutArray(someArray, null, 5, 1, false, 555));