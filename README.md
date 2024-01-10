# Passando dados entre activities

## Descrição

projeto simples para praticar a passagem de dados entre activities

## Passo a passo

- Passo 1 Criar a classe ( objeto) com construtor e getter e setters necessários. Exemplo:
     ```
     package br.com.cursoandroid.passandodadosactivity;

      import java.io.Serializable;

      public class Usuario implements Serializable {
      private String nome;
      private String email;
  
      public Usuario(String nome, String email) {
          this.nome = nome;
          this.email = email;
      }
  
      public String getNome() {
          return nome;
      }
  
      public void setNome(String nome) {
          this.nome = nome;
      }

      public String getEmail() {
          return email;
      }
  
      public void setEmail(String email) {
          this.email = email;
      }
     
- Passo 2  Instanciar o objeto no MainActivity dentro do método Onclick. Exemplo: 
      ```
  
        Usuario usuario = new Usuario("Anna","anna@gmail.com");

  - Passo 3 Passar os dados para outra activity
     ```
     intent.putExtra("objeto" , usuario);
     
- Passo 4 recuperar os dados enviados
     ```

     Usuario usuario = (Usuario) dados.getSerializable("objeto");

- Passo 5 configurar valores recuperados
   ```
   textNome.setText(usuario.getEmail());

## Capturas de Tela

![image](https://github.com/AnnaKarolineNunes/PassandoDadosEntreActivities/assets/101477642/81b94be4-61ac-49e8-93ff-037635e6483b)
![image](https://github.com/AnnaKarolineNunes/PassandoDadosEntreActivities/assets/101477642/8d4f897d-25aa-4737-b208-19747987b2f3)
