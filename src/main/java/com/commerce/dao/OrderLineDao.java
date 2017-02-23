package com.commerce.dao;

import java.util.List;
import com.commerce.beans.OrderLine;
import com.commerce.beans.COrder;

public interface OrderLineDao {
	public void save(OrderLine obj);
	public void update(OrderLine obj);
	public List<OrderLine> getByOrderId(COrder corder);
	public void delete(OrderLine obj);
	public List<OrderLine> list();
}
