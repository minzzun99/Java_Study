package ch8;

public class TryWithResourceEx {
    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()) {
            cr.excptionWork(false);     // 예외가 발생하지 않는다
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }
        System.out.println();

        try (CloseableResource cr = new CloseableResource()) {
            cr.excptionWork(true);
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }
    }
}

class CloseableResource implements AutoCloseable {
    public void excptionWork(boolean exception) throws WorkException {
        System.out.println("exceptionWork(" + exception + ")가 호출됨.");

        if (exception) {
            throw new WorkException("WorkException 발생!!!");
        }
    }

    public void close() throws CloseException {
        System.out.println("close()가 호출됨");
        throw new CloseException("CloseException 발생!!!");
    }
}

class WorkException extends Exception {
    WorkException(String msg) {
        super(msg);
    }
}

class CloseException extends Exception {
    CloseException(String msg) {
        super(msg);
    }
}
