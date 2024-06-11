package Excecoes;

public class ContaSuspensaException extends  RuntimeException{
    private static final long serialVersionUID = 1L;

    public ContaSuspensaException(String message) {
        super("Sua conta foi suspensa 12 horas!!!");
    }

    @Override
    public String toString() {
        return "ContaSuspensaException []";
    }
}
