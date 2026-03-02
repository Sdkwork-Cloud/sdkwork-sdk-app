using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CouponInfoVO
    {
        public string? CouponId { get; set; }
        public string? CouponName { get; set; }
        public string? DiscountAmount { get; set; }
        public string? CouponType { get; set; }
    }
}
