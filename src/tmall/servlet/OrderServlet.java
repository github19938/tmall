package tmall.servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tmall.bean.Order;
import tmall.util.Page;

/**
* @author Kr
* 创建时间：2017年9月7日 下午9:42:39
* 类说明：
*/
public class OrderServlet extends BaseBackServlet {

	@Override
	public String add(HttpServletRequest request, HttpServletResponse response, Page page) {

		return null;
	}

	@Override
	public String delete(HttpServletRequest request, HttpServletResponse response, Page page) {

		return null;
	}

	@Override
	public String edit(HttpServletRequest request, HttpServletResponse response, Page page) {

		return null;
	}

	@Override
	public String update(HttpServletRequest request, HttpServletResponse response, Page page) {

		return null;
	}

	@Override
	public String list(HttpServletRequest request, HttpServletResponse response, Page page) {
		List<Order> os = orderDAO.list(page.getStart(),page.getCount());
		orderItemDAO.fill(os);
		int total = orderDAO.getTotal();
		page.setTotal(total);
		request.setAttribute("os", os);
		request.setAttribute("page", page);
		return "admin/listOrder.jsp";
	}

}