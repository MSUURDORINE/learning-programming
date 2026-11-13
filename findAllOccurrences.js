 
function findAllOccurrences ( numbers,  target){
      for ( let index = 0; index < numbers.length; index++){
        if(numbers[index] === target){
            console.log("Fount at index " + index)
           } 
        }
    }  
    let numbers =  [3, 7, 2, 9, 5, 1, 8];
    findAllOccurrences(numbers, 2);


