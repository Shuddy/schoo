package javachukyu6;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java入門 フォワードクラス.
 */
@WebServlet("/ForwardSample")
public class ForwardSample extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * コンストラクタ.
	 */
    public ForwardSample() {
        super();
    }

    /**
     * GETメソッドでリクエストされた場合の処理.
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// このWebアプリケーションの設定を取得 // コンテキスト情報を取ります（このサイト内の情報をまるっと取ります）
		ServletContext con = request.getServletContext();
		// このWebアプリケーション内にあるページ（移動先のページ）を決定 // そのコンテキスト内に入っているどのファイル、どのJSP、どの移動先にあとは情報を任せるよという指定
		RequestDispatcher rd = con.getRequestDispatcher("/WEB-JavaChukyu6/redirect.jsp");
		// 移動先のページに移動 //フォワードはページの情報を引き継げる //元々受け取っているrequestの情報（31行）とレスポンスの情報の二つを合わせて次の画面に移っている
		rd.forward(request, response);
	}
}