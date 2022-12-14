import javax.swing.*;

public class MainExcep {

    public static void main(String[] args) throws SenhaInvalidaException, UsuarioInvalidoException {
        try {
            login();
        } catch (SenhaInvalidaException e) {
            JOptionPane.showMessageDialog(null, "Senha Inválida!");
        } catch (UsuarioInvalidoException e) {
            JOptionPane.showMessageDialog(null, "Usuário Inválido!" + e.getMessage());
        } finally {
            login();
        }
    }

    private static void login() throws SenhaInvalidaException, UsuarioInvalidoException {

        String usuario = JOptionPane.showInputDialog("Digite um usuário: ");
        String senha = JOptionPane.showInputDialog("Digite a senha: ");

        if (senha.length() <= 3){
            throw new SenhaInvalidaException();
        }

        if (usuario.length() <= 5){
            throw new UsuarioInvalidoException("Usuário: "+ usuario);
        }

        if (!senha.equals("1234")){
            login();
        }

        System.out.println("Acesso Concedido!");
    }
}
