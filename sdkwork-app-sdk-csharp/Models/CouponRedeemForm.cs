using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CouponRedeemForm
    {
        public string? RedeemCode { get; set; }
        public string? Channel { get; set; }
    }
}
