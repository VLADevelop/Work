// ДЗ 

// function camelize(str) {
//     let splitedString = str.split('-');
//     for (let i = 0; i < splitedString.length; i++) {
//       // splitedString[i] = splitedString[i].slice(0, 1).toUpperCase() + splitedString[i].slice(1); //мой вариант
//       splitedString[i] = firstSymbolUp(splitedString[i]);
//     }
//     let joinSring = splitedString.join('');
//     return joinSring;
//   }
  
//   function firstSymbolUp(str) {
//     return str.slice(0, 1).toUpperCase() + str.slice(1);
//   }
//   console.log(camelize('my-short-string'));
//   console.log(camelize('background-color'));
//   console.log(camelize('list-style-image'));
//   console.log(camelize('-webkit-transition'));

// ДЗ

// let arr = function([1, -2, 3, 4, -9, 6]);
// let arr = sumPositiveElement([]);
// let arr = sumNegativeElement([]);

// let sum = function(arrNumbers) {
//     let positive = 0;
//     let negative = 0;
//     for (let i = 0; i < arrNumbers.length; i++) {
//         const element = arrNumbers[i];
//         if (element<0)  {
//            negative+=element
//         }  else {
//             positive+=element
//         }
//     }
//     return [negative,positive]
// }
// console.log(sum([1, -2, 3, 4, -9, 6]))

// ДЗ

let sumPosAndNeg = function(arrNumbers) {
    let positive = sumWithStatus(arrNumbers,'+');
    let negative = sumWithStatus(arrNumbers,'-');
    return [negative,positive]
}

let sumWithStatus = function(arrNumbers, status) {
		let sum = 0;
    for (let i = 0; i < arrNumbers.length; i++) {
    	const element = arrNumbers[i];
			if (status === '-' && element<0) {
        sum+=element
			}
			if (status === '+' && element>0) {
        sum+=element
			}
    }
    return sum;
}

console.log(sumPosAndNeg([1, -2, 3, 4, -9, 6]));