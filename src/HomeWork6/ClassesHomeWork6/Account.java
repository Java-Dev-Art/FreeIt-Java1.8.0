package HomeWork6.ClassesHomeWork6;

import java.util.Arrays;

public interface Account {
    final static int LIMIT = 15000;

    void setBank();

    void setAccount();

    public static class InformationAboutAllOperation {
        private int receipt;
        private int cashWithdrawal;
        private double[] payments;
        private int sal;

        void setReceipt(int receipt) {
            sal = 0;
            this.receipt = receipt;
            sal += this.receipt;
        }

        void setCashWithdrawal(int cash) {
            if (cash < sal) {
                cashWithdrawal = cash;
                sal -= cash;
                System.out.println(cash + " pln снято\nОстаток : " + sal);
            } else {
                System.out.println("Невозможно снятие средств, проверте баланс!");
            }
        }

        void setPayments(double[] payments) {
            this.payments = new double[payments.length];
            int sum = 0;
            int count = 1;
            for (int i = 0; i < payments.length; i++) {
                if (payments[i] < sal) {
                    sal -= payments[i];
                    this.payments[i] = payments[i];
                    sum += this.payments[i];
                    System.out.println(count++ + " Платеж прошел. Остаток : " + sal);
                    if (sum == LIMIT){
                        System.out.println("лимит платежей превышен");
                    }
                } else {
                    System.out.println("проверьте сальдо");
                }
            }
        }

        public int getReceipt() {
            return receipt;
        }

        public int getCashWithdrawal() {
            return cashWithdrawal;
        }

        public void getPayments() {
            Arrays.stream(this.payments).forEach(System.out::println);
        }

        public int getSal() {
            return sal;
        }
    }
}
