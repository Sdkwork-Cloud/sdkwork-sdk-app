using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CouponStatisticsVO
    {
        public int? TotalCoupons { get; set; }
        public int? UnusedCount { get; set; }
        public int? UsedCount { get; set; }
        public int? ExpiredCount { get; set; }
    }
}
