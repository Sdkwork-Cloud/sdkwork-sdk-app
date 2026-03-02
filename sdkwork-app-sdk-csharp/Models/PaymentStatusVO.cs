using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PaymentStatusVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? PaymentOrderId { get; set; }
        public string? MerchantOrderId { get; set; }
        public string? Status { get; set; }
        public string? StatusName { get; set; }
        public string? Amount { get; set; }
        public int? PayTime { get; set; }
        public string? PaymentMethod { get; set; }
        public int? PaymentId { get; set; }
        public string? PaymentSn { get; set; }
        public int? OrderId { get; set; }
        public string? PaymentProvider { get; set; }
        public string? TransactionId { get; set; }
        public string? OutTradeNo { get; set; }
        public string? SuccessTime { get; set; }
    }
}
