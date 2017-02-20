package com.reapal.gworder.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * #aaa
 * </p>
 *
 * @author jackcooper
 * @since 2017-02-13
 */
@TableName("gw_orders")
public class GwOrders extends Model<GwOrders> {

    private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId(value="order_id")
	private Long orderId;
	/**
	 * 商户开通的服务名
	 */
	private String service;
	/**
	 * 订单号
	 */
	@TableField(value="merchant_order_no")
	private String merchantOrderNo;
	/**
	 * 合作商家客户号
	 */
	@TableField(value="merchant_id")
	private String merchantId;
	/**
	 * 卖家名称
	 */
	@TableField(value="seller_name")
	private String sellerName;
	/**
	 * 卖家(收款)ID
	 */
	@TableField(value="seller_id")
	private String sellerId;
	/**
	 * 买家名称
	 */
	@TableField(value="buyer_name")
	private String buyerName;
	/**
	 * 买家(付款)ID
	 */
	@TableField(value="buyer_id")
	private String buyerId;
	/**
	 * 卖家(收款)备注
	 */
	@TableField(value="seller_remarks")
	private String sellerRemarks;
	/**
	 * 买家(付款)备注
	 */
	@TableField(value="buyer_remarks")
	private String buyerRemarks;
	/**
	 * 买家实名
	 */
	@TableField(value="buyer_realname")
	private String buyerRealname;
	/**
	 * 买家联系方式
	 */
	@TableField(value="buyer_contact")
	private String buyerContact;
	/**
	 * 商品单价
	 */
	private BigDecimal price;
	/**
	 * 查询密钥
	 */
	@TableField(value="query_key")
	private String queryKey;
	/**
	 * 商品数量
	 */
	private BigDecimal quantity;
	/**
	 * 签名类型[MD5,RSA]
	 */
	@TableField(value="sign_type")
	private String signType;
	/**
	 * 字符集
	 */
	private String charsets;
	/**
	 * 币种
	 */
	private String currency;
	/**
	 * 商家订单日期
	 */
	@TableField(value="order_date")
	private String orderDate;
	/**
	 * 订单过期表达式
	 */
	@TableField(value="exp_dates")
	private String expDates;
	/**
	 * 订单创建IP
	 */
	private String ips;
	/**
	 * 订单状态
	 */
	private String ordersts;
	/**
	 * 返回URL
	 */
	@TableField(value="return_url")
	private String returnUrl;
	/**
	 * 通知URL
	 */
	@TableField(value="notify_url")
	private String notifyUrl;
	/**
	 * 订单主题
	 */
	private String subject;
	/**
	 * 订单说明
	 */
	private String bodys;
	/**
	 * 总金额
	 */
	private BigDecimal amount;
	/**
	 * 价格是否调整[0未调整 1 调整]
	 */
	@TableField(value="price_changed")
	private BigDecimal priceChanged;
	/**
	 * 版本信息
	 */
	@TableField(value="api_version")
	private String apiVersion;
	/**
	 * 本地语言
	 */
	private String locale;
	/**
	 * 偏爱银行
	 */
	private String preference;
	/**
	 * 退款金额
	 */
	@TableField(value="refund_amount")
	private BigDecimal refundAmount;
	/**
	 * 退款状态
	 */
	@TableField(value="refund_sts")
	private String refundSts;
	/**
	 * 订单类型
	 */
	@TableField(value="order_type")
	private String orderType;
	/**
	 * 支付访问
	 */
	@TableField(value="pay_method")
	private String payMethod;
	/**
	 * 服务费
	 */
	@TableField(value="service_fee")
	private BigDecimal serviceFee;
	/**
	 * 代理商户ID
	 */
	private String agentid;
	/**
	 * 关闭日期
	 */
	@TableField(value="close_date_time")
	private Date closeDateTime;
	/**
	 * 显示URL
	 */
	@TableField(value="show_url")
	private String showUrl;
	/**
	 * 风控指纹ID
	 */
	@TableField(value="token_id")
	private String tokenId;
	/**
	 * 风控会员IP
	 */
	@TableField(value="member_ip")
	private String memberIp;
	/**
	 * 设备信息
	 */
	@TableField(value="terminal_info")
	private String terminalInfo;
	/**
	 * 设备类型
	 */
	@TableField(value="terminal_type")
	private String terminalType;
	/**
	 * 产品ID
	 */
	@TableField(value="business_id")
	private String businessId;
	/**
	 * 产品类型
	 */
	@TableField(value="product_type")
	private String productType;
	/**
	 * 返回编码
	 */
	@TableField(value="result_code")
	private String resultCode;
	/**
	 * 返回信息
	 */
	@TableField(value="result_msg")
	private String resultMsg;
	/**
	 * 修改日期
	 */
	@TableField(value="modify_date_time")
	private Date modifyDateTime;
	/**
	 * 修改人
	 */
	@TableField(value="modify_user_id")
	private String modifyUserId;
	/**
	 * 删除标志
	 */
	@TableField(value="delete_flag")
	private String deleteFlag;
	/**
	 * 创建日期
	 */
	@TableField(value="create_date_time")
	private Date createDateTime;
	/**
	 * 创建人
	 */
	@TableField(value="create_user_id")
	private String createUserId;
	/**
	 * 产品类型
	 */
	@TableField(value="product_category_id")
	private String productCategoryId;
	/**
	 * 产品ID
	 */
	@TableField(value="product_id")
	private String productId;
	/**
	 * 接口类型
	 */
	@TableField(value="api_type")
	private String apiType;
	/**
	 * 会员ID
	 */
	@TableField(value="member_id")
	private String memberId;
	/**
	 * 退款中金额
	 */
	@TableField(value="refund_amount_sure")
	private BigDecimal refundAmountSure;
	/**
	 * 协议号
	 */
	@TableField(value="protocol_no")
	private String protocolNo;
	/**
	 * 绑卡ID
	 */
	@TableField(value="bind_id")
	private String bindId;
	/**
	 * 卡类型
	 */
	@TableField(value="card_type")
	private String cardType;
	/**
	 * 鉴权标志
	 */
	@TableField(value="identify_flag")
	private String identifyFlag;
	/**
	 * 充值用途:0现金1预付手续费2保证金
	 */
	@TableField(value="charge_purpose")
	private String chargePurpose;
	/**
	 * 短信验证标识
	 */
	@TableField(value="sms_check")
	private String smsCheck;
	/**
	 * 设备ID
	 */
	@TableField(value="device_id")
	private String deviceId;
	/**
	 * 优惠金额
	 */
	@TableField(value="discount_amount")
	private BigDecimal discountAmount;
	/**
	 * 实际金额
	 */
	@TableField(value="real_amount")
	private BigDecimal realAmount;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getMerchantOrderNo() {
		return merchantOrderNo;
	}

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getSellerRemarks() {
		return sellerRemarks;
	}

	public void setSellerRemarks(String sellerRemarks) {
		this.sellerRemarks = sellerRemarks;
	}

	public String getBuyerRemarks() {
		return buyerRemarks;
	}

	public void setBuyerRemarks(String buyerRemarks) {
		this.buyerRemarks = buyerRemarks;
	}

	public String getBuyerRealname() {
		return buyerRealname;
	}

	public void setBuyerRealname(String buyerRealname) {
		this.buyerRealname = buyerRealname;
	}

	public String getBuyerContact() {
		return buyerContact;
	}

	public void setBuyerContact(String buyerContact) {
		this.buyerContact = buyerContact;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getQueryKey() {
		return queryKey;
	}

	public void setQueryKey(String queryKey) {
		this.queryKey = queryKey;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getCharsets() {
		return charsets;
	}

	public void setCharsets(String charsets) {
		this.charsets = charsets;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getExpDates() {
		return expDates;
	}

	public void setExpDates(String expDates) {
		this.expDates = expDates;
	}

	public String getIps() {
		return ips;
	}

	public void setIps(String ips) {
		this.ips = ips;
	}

	public String getOrdersts() {
		return ordersts;
	}

	public void setOrdersts(String ordersts) {
		this.ordersts = ordersts;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBodys() {
		return bodys;
	}

	public void setBodys(String bodys) {
		this.bodys = bodys;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getPriceChanged() {
		return priceChanged;
	}

	public void setPriceChanged(BigDecimal priceChanged) {
		this.priceChanged = priceChanged;
	}

	public String getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public BigDecimal getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundSts() {
		return refundSts;
	}

	public void setRefundSts(String refundSts) {
		this.refundSts = refundSts;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public BigDecimal getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(BigDecimal serviceFee) {
		this.serviceFee = serviceFee;
	}

	public String getAgentid() {
		return agentid;
	}

	public void setAgentid(String agentid) {
		this.agentid = agentid;
	}

	public Date getCloseDateTime() {
		return closeDateTime;
	}

	public void setCloseDateTime(Date closeDateTime) {
		this.closeDateTime = closeDateTime;
	}

	public String getShowUrl() {
		return showUrl;
	}

	public void setShowUrl(String showUrl) {
		this.showUrl = showUrl;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public String getMemberIp() {
		return memberIp;
	}

	public void setMemberIp(String memberIp) {
		this.memberIp = memberIp;
	}

	public String getTerminalInfo() {
		return terminalInfo;
	}

	public void setTerminalInfo(String terminalInfo) {
		this.terminalInfo = terminalInfo;
	}

	public String getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public Date getModifyDateTime() {
		return modifyDateTime;
	}

	public void setModifyDateTime(Date modifyDateTime) {
		this.modifyDateTime = modifyDateTime;
	}

	public String getModifyUserId() {
		return modifyUserId;
	}

	public void setModifyUserId(String modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(String productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getApiType() {
		return apiType;
	}

	public void setApiType(String apiType) {
		this.apiType = apiType;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public BigDecimal getRefundAmountSure() {
		return refundAmountSure;
	}

	public void setRefundAmountSure(BigDecimal refundAmountSure) {
		this.refundAmountSure = refundAmountSure;
	}

	public String getProtocolNo() {
		return protocolNo;
	}

	public void setProtocolNo(String protocolNo) {
		this.protocolNo = protocolNo;
	}

	public String getBindId() {
		return bindId;
	}

	public void setBindId(String bindId) {
		this.bindId = bindId;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getIdentifyFlag() {
		return identifyFlag;
	}

	public void setIdentifyFlag(String identifyFlag) {
		this.identifyFlag = identifyFlag;
	}

	public String getChargePurpose() {
		return chargePurpose;
	}

	public void setChargePurpose(String chargePurpose) {
		this.chargePurpose = chargePurpose;
	}

	public String getSmsCheck() {
		return smsCheck;
	}

	public void setSmsCheck(String smsCheck) {
		this.smsCheck = smsCheck;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public BigDecimal getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(BigDecimal realAmount) {
		this.realAmount = realAmount;
	}

	@Override
	protected Serializable pkVal() {
		return this.orderId;
	}

	@Override
	public String toString() {
		return "GwOrders{" +
				"orderId=" + orderId +
				", service='" + service + '\'' +
				", merchantOrderNo='" + merchantOrderNo + '\'' +
				", merchantId='" + merchantId + '\'' +
				", sellerName='" + sellerName + '\'' +
				", sellerId='" + sellerId + '\'' +
				", buyerName='" + buyerName + '\'' +
				", buyerId='" + buyerId + '\'' +
				", sellerRemarks='" + sellerRemarks + '\'' +
				", buyerRemarks='" + buyerRemarks + '\'' +
				", buyerRealname='" + buyerRealname + '\'' +
				", buyerContact='" + buyerContact + '\'' +
				", price=" + price +
				", queryKey='" + queryKey + '\'' +
				", quantity=" + quantity +
				", signType='" + signType + '\'' +
				", charsets='" + charsets + '\'' +
				", currency='" + currency + '\'' +
				", orderDate='" + orderDate + '\'' +
				", expDates='" + expDates + '\'' +
				", ips='" + ips + '\'' +
				", ordersts='" + ordersts + '\'' +
				", returnUrl='" + returnUrl + '\'' +
				", notifyUrl='" + notifyUrl + '\'' +
				", subject='" + subject + '\'' +
				", bodys='" + bodys + '\'' +
				", amount=" + amount +
				", priceChanged=" + priceChanged +
				", apiVersion='" + apiVersion + '\'' +
				", locale='" + locale + '\'' +
				", preference='" + preference + '\'' +
				", refundAmount=" + refundAmount +
				", refundSts='" + refundSts + '\'' +
				", orderType='" + orderType + '\'' +
				", payMethod='" + payMethod + '\'' +
				", serviceFee=" + serviceFee +
				", agentid='" + agentid + '\'' +
				", closeDateTime=" + closeDateTime +
				", showUrl='" + showUrl + '\'' +
				", tokenId='" + tokenId + '\'' +
				", memberIp='" + memberIp + '\'' +
				", terminalInfo='" + terminalInfo + '\'' +
				", terminalType='" + terminalType + '\'' +
				", businessId='" + businessId + '\'' +
				", productType='" + productType + '\'' +
				", resultCode='" + resultCode + '\'' +
				", resultMsg='" + resultMsg + '\'' +
				", modifyDateTime=" + modifyDateTime +
				", modifyUserId='" + modifyUserId + '\'' +
				", deleteFlag='" + deleteFlag + '\'' +
				", createDateTime=" + createDateTime +
				", createUserId='" + createUserId + '\'' +
				", productCategoryId='" + productCategoryId + '\'' +
				", productId='" + productId + '\'' +
				", apiType='" + apiType + '\'' +
				", memberId='" + memberId + '\'' +
				", refundAmountSure=" + refundAmountSure +
				", protocolNo='" + protocolNo + '\'' +
				", bindId='" + bindId + '\'' +
				", cardType='" + cardType + '\'' +
				", identifyFlag='" + identifyFlag + '\'' +
				", chargePurpose='" + chargePurpose + '\'' +
				", smsCheck='" + smsCheck + '\'' +
				", deviceId='" + deviceId + '\'' +
				", discountAmount=" + discountAmount +
				", realAmount=" + realAmount +
				'}';
	}
}
