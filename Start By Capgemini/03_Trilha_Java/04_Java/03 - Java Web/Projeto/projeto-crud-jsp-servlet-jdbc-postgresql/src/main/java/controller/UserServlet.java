package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import dao.UserDAO;
//Define o servlet para a aplicação, mapeado para a URL raiz ("/").
@WebServlet("/")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Instância do DAO para acessar os métodos de manipulação de dados do banco.
	private UserDAO userDAO;

	// Inicializa o servlet e cria a instância do UserDAO.
	public void init() {
		userDAO = new UserDAO();
	}

	// Método POST redireciona todas as requisições para o método GET.
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	// Método GET responsável por identificar a ação a ser realizada com base no caminho da URL.
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Obtém o caminho da solicitação para determinar a ação (ex.: "/new", "/insert").
		String action = request.getServletPath();

		try {
			// Switch para executar a ação apropriada com base na URL.
			switch (action) {
				case "/new":
					// Exibe o formulário para criar um novo usuário.
					showNewForm(request, response);
					break;
				case "/insert":
					// Insere um novo usuário no banco.
					insertUser(request, response);
					break;
				case "/delete":
					// Exclui um usuário existente do banco.
					deleteUser(request, response);
					break;
				case "/edit":
					// Exibe o formulário para editar um usuário existente.
					showEditForm(request, response);
					break;
				case "/update":
					// Atualiza os dados de um usuário no banco.
					updateUser(request, response);
					break;
				default:
					// Lista todos os usuários caso nenhuma ação específica seja solicitada.
					listUser(request, response);
					break;
			}
		} catch (SQLException ex) {
			// Lança uma exceção para capturar erros do banco de dados.
			throw new ServletException(ex);
		}
	}

	// Lista todos os usuários e redireciona para a página "user-list.jsp".
	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<User> listUser = userDAO.selectAllUsers();
		// Define a lista de usuários como atributo da requisição.
		request.setAttribute("listUser", listUser);
		// Encaminha a requisição para o JSP responsável por exibir os usuários.
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
		dispatcher.forward(request, response);
	}

	// Exibe o formulário para criar um novo usuário.
	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		dispatcher.forward(request, response);
	}

	// Exibe o formulário para editar um usuário existente.
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		// Obtém o ID do usuário a ser editado a partir dos parâmetros da requisição.
		int id = Integer.parseInt(request.getParameter("id"));
		// Busca os dados do usuário no banco.
		User existingUser = userDAO.selectUser(id);
		// Define o usuário como atributo da requisição.
		request.setAttribute("user", existingUser);
		// Encaminha a requisição para o formulário de edição.
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		dispatcher.forward(request, response);
	}

	// Insere um novo usuário no banco de dados.
	private void insertUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		// Obtém os dados do formulário enviados na requisição.
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		// Cria uma nova instância de User com os dados obtidos.
		User newUser = new User(name, email, country);
		// Chama o método do DAO para inserir o usuário no banco.
		userDAO.insertUser(newUser);
		// Redireciona para a página que lista todos os usuários.
		response.sendRedirect("list");
	}

	// Atualiza os dados de um usuário existente no banco de dados.
	private void updateUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		// Obtém os dados do formulário enviados na requisição.
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		// Cria uma instância de User com os dados atualizados.
		User user = new User(id, name, email, country);
		// Chama o método do DAO para atualizar os dados do usuário no banco.
		userDAO.updateUser(user);
		// Redireciona para a página que lista todos os usuários.
		response.sendRedirect("list");
	}

	// Remove um usuário do banco de dados.
	private void deleteUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		// Obtém o ID do usuário a ser excluído a partir dos parâmetros da requisição.
		int id = Integer.parseInt(request.getParameter("id"));
		// Chama o método do DAO para excluir o usuário.
		userDAO.deleteUser(id);
		// Redireciona para a página que lista todos os usuários.
		response.sendRedirect("list");
	}
}
