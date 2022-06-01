let areMatchedBrackets = function(b1, b2){
    return (b1 === '(' && b2 === ')') || b1 === '{' && b2 === '}' || b1 === '[' && b2 === ']';
}

var isValid = function(s) {
    const stack = [];
    
    for(const char of s){
        if(stack.length === 0){
            stack.push(char);
            continue;
        }
        
        const topChar = stack.at(-1); // 
        console.log(topChar);
        
        if(areMatchedBrackets(topChar, char)){
            stack.pop();
        }else{
            stack.push(char);
        }
    }
    
    return stack.length === 0;
};

/**
[Jason]

 var isValid = function(s) {
    const data = s;
    let a = 0;
    let m = 0;
    let l = 0;

    for (let i=0; i<data.length; i++) {
        if (data.charAt(i) === '(') {
            a++;
        } else if (data.charAt(i) === ')') {
            a--;
        } else if (data.charAt(i) === '{') {
            m++;
        } else if (data.charAt(i) === '}') {
            m--;
        } else if (data.charAt(i) === '[') {
            l++;
        } else if (data.charAt(i) === ']') {
            l--;
        }
        
        if (a < 0 || m < 0 || l < 0) break;
    }

    let isValid = false;
    if (a === 0 && m === 0 && l === 0) {
        isValid = true;
    }
    return isValid;
}; 
 */