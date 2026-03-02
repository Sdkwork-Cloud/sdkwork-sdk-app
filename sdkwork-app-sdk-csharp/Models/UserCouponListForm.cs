using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UserCouponListForm
    {
        public string? Status { get; set; }
        public string? Type { get; set; }
        public int? PageNum { get; set; }
        public int? PageSize { get; set; }
    }
}
