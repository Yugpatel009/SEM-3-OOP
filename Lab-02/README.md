# Lab 2 — Object Oriented Programming (CEUE203)

- **PartA/** — practice programs (Hour 1), one per `Practical-N` folder.
- **PartB/Miniproject/** — MiniBank at its Lab 2 stage (adds Customer and Account).

## Requirement
JDK 17 or newer — check with `java -version`.

## Run Part A
- Practical-1 (Smart thermostat): `cd PartA/Practical-1 && javac Thermostat.java && java Thermostat`
- Practical-2 (Cinema show): `cd PartA/Practical-2 && javac CinemaShow.java && java CinemaShow`
- Practical-3 (Parking lot, advanced/home): `cd PartA/Practical-3 && javac ParkingLot.java && java ParkingLot`

## Run Part B (MiniBank)
```
cd PartB/Miniproject
javac *.java
java MiniBank     # the real menu (entry point)
java Main         # scratch test that exercises Account/Customer this lab
```

## Submit on GitHub
Copy Part A into `lab-02/` and the project into `Miniproject/`, then:
```
git add .
git commit -m "Lab 2 complete (Part A + Part B)"
git tag lab-02
git push origin main --tags
```
