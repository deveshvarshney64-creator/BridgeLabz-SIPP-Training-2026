public class BankSimulation{

    // ================= BANK ACCOUNT CLASS =================
    static class BankAccount {

        private static int totalAccounts = 0;
        private static int nextAccountNumber = 1001;

        private int accountNumber;
        private String holder;
        private double balance;
        private String[] transactionLog;
        private int logCount;

        public BankAccount(String holder, double initialDeposit) {
            this.accountNumber = nextAccountNumber++;
            this.holder = holder;
            this.balance = initialDeposit;
            this.transactionLog = new String[20];
            this.logCount = 0;
            totalAccounts++;

            log("Account opened with Rs." + initialDeposit);
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("[ERROR] Invalid deposit amount");
                return;
            }
            balance += amount;
            log("Deposited Rs." + amount + " | Balance: Rs." + balance);
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("[ERROR] Invalid withdrawal amount");
                return;
            }
            if (amount > balance) {
                System.out.println("[BLOCKED] Overdraft attempt");
                log("Overdraft blocked: Rs." + amount);
                return;
            }
            balance -= amount;
            log("Withdrawn Rs." + amount + " | Balance: Rs." + balance);
        }

        public void getStatement() {
            System.out.println("\nAccount No: " + accountNumber);
            System.out.println("Holder: " + holder);
            System.out.println("Balance: Rs." + balance);
            System.out.println("Transactions:");

            for (int i = 0; i < logCount; i++) {
                System.out.println((i + 1) + ". " + transactionLog[i]);
            }
        }

        private void log(String entry) {
            if (logCount < transactionLog.length) {
                transactionLog[logCount++] = entry;
            }
        }

        public static int getTotalAccounts() {
            return totalAccounts;
        }

        public double getBalance() {
            return balance;
        }

        public String getHolder() {
            return holder;
        }
    }

    // ================= LOGGER CLASS =================
    static class TransactionLogger {

        public static void printHeader() {
            System.out.println("===== BANK SYSTEM =====");
        }

        public static void printSectionTitle(String title) {
            System.out.println("\n-- " + title + " --");
        }

        public static void printAccountSummary(BankAccount acc) {
            System.out.println(acc.getHolder() + " | Balance: Rs." + acc.getBalance());
        }

        public static void printFooter(int total) {
            System.out.println("\nTotal Accounts: " + total);
            System.out.println("===== END =====");
        }
    }

    // ================= MAIN METHOD =================
    public static void main(String[] args) {

        TransactionLogger.printHeader();

        BankAccount acc1 = new BankAccount("Ravi", 10000);
        BankAccount acc2 = new BankAccount("Priya", 25000);
        BankAccount acc3 = new BankAccount("Ankit", 5000);

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());

        // Ravi - 5 transactions
        TransactionLogger.printSectionTitle("Ravi");
        acc1.deposit(5000);
        acc1.withdraw(3000);
        acc1.deposit(2000);
        acc1.withdraw(20000); // overdraft
        acc1.withdraw(1000);

        // Priya - 5 transactions
        TransactionLogger.printSectionTitle("Priya");
        acc2.deposit(10000);
        acc2.withdraw(8000);
        acc2.deposit(3000);
        acc2.withdraw(15000);
        acc2.deposit(500);

        // Ankit - 5 transactions
        TransactionLogger.printSectionTitle("Ankit");
        acc3.deposit(1000);
        acc3.withdraw(4000); // overdraft
        acc3.deposit(2000);
        acc3.withdraw(500);
        acc3.withdraw(3000); // overdraft

        // Statements
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        // Summary
        TransactionLogger.printAccountSummary(acc1);
        TransactionLogger.printAccountSummary(acc2);
        TransactionLogger.printAccountSummary(acc3);

        TransactionLogger.printFooter(BankAccount.getTotalAccounts());
    }
}