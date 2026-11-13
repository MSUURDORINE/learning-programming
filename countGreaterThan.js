 
function countGreaterThan ( numbers,  threshold){
        let count = 0;
      for ( let index = 0; index < numbers.length; index++){
        if(numbers[index] > threshold){
            count++;
           } 
          }
          return count;
    }  
    let numbers =  [3, 7, 2, 9, 5, 1, 8];
    console.log(countGreaterThan(numbers, 5));


