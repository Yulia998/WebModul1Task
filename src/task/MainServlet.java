package task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainServlet extends javax.servlet.http.HttpServlet {
    List<String> history = new ArrayList<>();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        process(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        process(request, response);
    }

    protected void process(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Double first = Double.parseDouble(request.getParameter("numberOne"));
        Double second = Double.parseDouble(request.getParameter("numberTwo"));
        String operation = request.getParameter("selctOp");
        Double result;
        if(operation.equals("+")) {
            result = Operations.add(first, second);
        } else if (operation.equals("-")) {
            result = Operations.minus(first, second);
        }  else if (operation.equals("*")) {
            result = Operations.miltiply(first, second);
        }  else {
            result = Operations.divide(first, second);
        }
        String resultStr = first + operation + second + " = " + result;
        history.add(resultStr);
        request.getSession().setAttribute("history", history);
        request.getSession().setAttribute("result", resultStr);
        response.sendRedirect("/WebModul1Task_war_exploded/");
    }
}
