using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PaymentStatisticsVO
    {
        public int? TotalPayments { get; set; }
        public int? PendingPayments { get; set; }
        public int? SuccessPayments { get; set; }
        public int? FailedPayments { get; set; }
        public int? ClosedPayments { get; set; }
    }
}
