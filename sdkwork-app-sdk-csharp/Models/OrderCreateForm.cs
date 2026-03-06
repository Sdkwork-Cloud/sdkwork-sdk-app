using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OrderCreateForm
    {
        public string? OrderType { get; set; }
        public string? ProductId { get; set; }
        public int? Quantity { get; set; }
        public List<OrderItemForm>? Items { get; set; }
        public string? AddressId { get; set; }
        public string? PaymentMethod { get; set; }
        public string? CouponId { get; set; }
        public string? Remark { get; set; }
        public string? SourceChannel { get; set; }
        public int? RechargePoints { get; set; }
        public bool? OrderPayloadValid { get; set; }
    }
}
