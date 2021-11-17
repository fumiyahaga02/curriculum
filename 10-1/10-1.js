// 問1
let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓
function isEven() {
    for (let num of numbers){
        if (num % 2 === 0) {
            console.log(num + 'は偶数です');
        }
    }
}
isEven();

// 問2
class Car {
    constructor(gas, num) {
        this.gas = gas;
        this.num = num;
    }

    getNumGas() {
        console.log(`ガソリンは${this.gas}です。ナンバーは${this.num}です`);
    }
}
let car = new Car(10, 1234);
car.getNumGas();