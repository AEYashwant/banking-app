# banking-app
🏦 Banking App (Java Console)
A simple console-based banking application written in Java. It simulates basic banking operations like checking your balance, depositing money, and withdrawing money.
Features

✅ Username validation (letters only)
✅ Check current balance
✅ Deposit money (with positive amount validation)
✅ Withdraw money (with balance & positive amount validation)
✅ Formatted currency output
✅ Robust input handling (no crashes on invalid input)

How to Run
Prerequisites

Java JDK 8 or higher installed
A terminal / command prompt

Steps
bash# 1. Clone the repository
git clone https://github.com/YOUR_USERNAME/banking-app.git

# 2. Navigate into the folder
cd banking-app

# 3. Compile
javac BankingApp.java

# 4. Run
java BankingApp
Sample Output
Enter your name: John

Welcome, John! Your starting balance is ₹1000.00

=== BANKING MENU ===
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter your choice: 2
Enter amount to deposit: ₹500
Deposit successful! New Balance: ₹1500.00
Project Structure
banking-app/
├── BankingApp.java   # Main source file
└── README.md         # Project documentation
