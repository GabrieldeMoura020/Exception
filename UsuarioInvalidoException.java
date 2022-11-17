import javax.xml.bind.ValidationException;

public class UsuarioInvalidoException extends ValidationException {

    public UsuarioInvalidoException(String message) {
        super(message);
    }
}
