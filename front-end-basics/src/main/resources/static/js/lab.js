// 1. Sort array
function sortArray(args, sortingDirection) {
    if (sortingDirection === "asc") {
        return args.sort((a, b) => a - b);
    }
    return args.sort((a, b) => b - a);
}

// console.log(sortArray([14, 7, 17, 6, 8], 'asc'));
// console.log(sortArray([14, 7, 17, 6, 8], 'desc'));

// 2. Arguments info
function argumentsInfo() {
    let map = new Map();

    for (let arg of arguments) {
        let type = typeof arg;

        if (!map.has(type)) {
            map.set(type, 0);
        }

        map.set(type, map.get(type) + 1);
        console.log(`${type}: ${arg}`);
    }

    [...map.entries()]
        .sort((a, b) => b[1] - a[1])
        .forEach(elem => console.log(`${elem[0]} = ${elem[1]}`));
}

// argumentsInfo('cat', 42, 'dog', function () {
//     console.log('Hello world!');
// });


// 3. Personal BMI
function personalBMI(name, age, weight, height) {
    let bmi = Math.round(weight / (height / 100 * height / 100));

    let status = () => {
        if (bmi < 18.5)
            return "underweight"
        if (bmi < 25)
            return "normal"
        if (bmi < 30)
            return "overweight"
        return "obese"
    }

    let result = {
        name: name,
        personalInfo: {
            age: age,
            weight: weight,
            height: height
        },
        BMI: bmi,
        status: status()
    }

    if (status() === 'obese') {
        result.recommendation = 'admission required';
    }

    console.log(result)
}

// personalBMI("Peter", 29, 75, 182);
// personalBMI("Honey Boo Boo", 9, 57, 137);

// 4. Heroic Inventory

function heroicInventory(args) {
    let result = [];

    args.map(heroInput => {
        let [name, level, items] = heroInput.split(' / ')
        result.push({name, level: Number(level), items: items ? items.split(', ') : []})
    })

    console.log(JSON.stringify(result))
}

heroicInventory(['Isacc / 25 / Apple, GravityGun',
    'Derek / 12 / BarrelVest, DestructionSword',
    'Hes / 1 / Desolator, Sentinel, Antara']
);

heroicInventory(['Jake / 1000 / Gauss, HolidayGrenade']);
