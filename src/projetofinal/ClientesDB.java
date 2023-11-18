package projetofinal;


import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ClientesDB {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArraList<ClientesDados> lista = new ArrayList<>();
    
    public void cadastrarCliente (ClientesDados objClientesDados){
        String sql = "insert into java.clientes (nome, endereco, cidade, telefone) values(?,?,?,?)";
        conn = Conexao.getConexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objectClientesDados.getNome_cliente());
            pstm.setString(2, objectClientesDados.getendereco_cliente());
            pstm.setString(3, objectClientesDados.getCidade_cliente());
            pstm.setString(4, objectClientesDados.getTelefone_cliente());
            pstm.close();
        }catch (exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public ArrayList<ClientesDados> ListarClientes() {
        String sql = "select * from java.clientes order by id_cliente desc";
        conn = Conexao.getConexao();
        try{
            pstm = conn.prepareStatemente (sql);
            rs = pstm.executeQuery();
            while (rs.next()){
                ClientesDados objectClientesDados = new ClientesDados();
                objClientesDados.setId_cliente(rs.getInt("id_cliente"));
                objClientesDados.setId_cliente(rs.getInt("nome"));
                objClientesDados.setId_cliente(rs.getInt("endereco"));
                objClientesDados.setId_cliente(rs.getInt("cidade"));
                objClientesDados.setId_cliente(rs.getInt("telefone"));
                lista.add(objClientesDTO);
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
            }
        return lista;
        }
    public void alterarCliente (ClientesDados objClientesDados){
        String sql = "update clientes set nome = ?, endereco = ?, cidade = ?,"
                + "telefone = ? where id_cliente = ?;"
                conn = Conexao.getConexao();
                try{
                    pstm = conn.prepareStatement(sql);
                    pstm.setString(1, objectClientesDados.getNome_cliente());
                    pstm.setString(2, objectClientesDados.getendereco_cliente());
                    pstm.setString(3, objectClientesDados.getCidade_cliente());
                    pstm.setString(4, objectClientesDados.getTelefone_cliente());
                    pstm.execute();
                    pstm.close();
                }catch (SQLException e){
                    JOptionPane.showMessageDialog(null,e);
                }
            }
    public void escluirCliente(ClientesDados objClientesDados){
        string sql = "delete from clientes where id_cliente = ?";
        conn = Conexao.getConexao();
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objClientesDados.getId_cliente());
            pstm.execute();
            pstm.close();
        }catch (SQLException e){
            JOptionPane.sgowMessageDialog(null,e);
        }
    
    }
    
  
}
