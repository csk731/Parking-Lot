package com.parkinglot.models;

import com.parkinglot.strategies.payments.PaymentStrategies;

import java.time.LocalDateTime;
import java.util.List;

public class Bill extends BaseModel{
    private int totalBill;
    private String operatorName;
    private Ticket ticket;
    private BillStatus billStatus;
    private Gate exitGate;
    private LocalDateTime exitTime;
    private List<PaymentStrategies> paymentStrategies;

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public List<PaymentStrategies> getPaymentStrategies() {
        return paymentStrategies;
    }

    public void setPaymentStrategies(List<PaymentStrategies> paymentStrategies) {
        this.paymentStrategies = paymentStrategies;
    }
}
