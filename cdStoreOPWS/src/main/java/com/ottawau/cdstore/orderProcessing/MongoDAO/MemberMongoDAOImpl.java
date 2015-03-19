/**
 * created by : Indhra Priya Shanmugam
 * 
 */

package com.ottawau.cdstore.orderProcessing.MongoDAO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.ottawau.cdstore.orderProcessing.DAO.GenericDAOImpl;
import com.ottawau.cdstore.orderProcessing.entity.MongoMember;
import com.ottawau.cdstore.orderProcessing.entity.PurchaseOrder;
import com.ottawau.cdstore.orderProcessing.util.HibernateUtil;

public class MemberMongoDAOImpl extends MongoGenericDAOImpl<MongoMember, Serializable> implements IMemberMongoDAO {
	
	public MemberMongoDAOImpl(String collectionName) {
		super(collectionName);
		
	}
	
}
