# Lab 1 — Object Oriented Programming (CEUE203)

This lab has two parts:
- **PartA/** — practice programs (Hour 1). Each `Practical-N` folder is one standalone program.
- **PartB/Miniproject/** — the MiniBank project (Hour 2), at its Lab 1 stage (the menu shell).

## Requirement
JDK 17 or newer — check with `java -version`.

## Run Part A (open a terminal inside the practical folder)
- Practical-1 (Vending machine): `cd PartA/Practical-1 && javac VendingMachine.java && java VendingMachine`
- Practical-2 (Toll booth): `cd PartA/Practical-2 && javac TollBooth.java && java TollBooth`
- Practical-3 (RPSLS, advanced/home): `cd PartA/Practical-3 && javac RPSLS.java && java RPSLS`

These programs read input, so type your answers when prompted.

## Run Part B (MiniBank)
```
cd PartB/Miniproject
javac *.java
java MiniBank
```

## Submit on GitHub
Copy Part A into your repo under `lab-01/` and the project under `Miniproject/`, then:
```
git add .
git commit -m "Lab 1 complete (Part A + Part B)"
git tag lab-01
git push origin main --tags
```
