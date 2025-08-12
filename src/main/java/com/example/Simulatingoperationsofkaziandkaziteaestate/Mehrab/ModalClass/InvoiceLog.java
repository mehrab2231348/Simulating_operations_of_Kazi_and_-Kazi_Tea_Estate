package com.example.Simulatingoperationsofkaziandkaziteaestate.Mehrab.ModalClass;

public class InvoiceLog {
    private String invoiceId;
    private String status;
    private String reason;
    private String date;

    public InvoiceLog(String invoiceId, String status, String reason, String date) {
        this.invoiceId = invoiceId;
        this.status = status;
        this.reason = reason;
        this.date = date;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getStatus() {
        return status;
    }

    public String getReason() {
        return reason;
    }

    public String getDate() {
        return date;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "InvoiceLog{" +
                "invoiceId='" + invoiceId + '\'' +
                ", status='" + status + '\'' +
                ", reason='" + reason + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}