using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OrderStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalOrders { get; set; }
        public int? PendingPayment { get; set; }
        public int? PendingShipment { get; set; }
        public int? PendingReceipt { get; set; }
        public int? Completed { get; set; }
        public string? TotalAmount { get; set; }
    }
}
