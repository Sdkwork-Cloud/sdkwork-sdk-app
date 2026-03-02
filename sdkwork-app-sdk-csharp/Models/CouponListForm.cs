using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CouponListForm
    {
        public string? Type { get; set; }
        public string? Status { get; set; }
        public string? Keyword { get; set; }
        public int? PageNum { get; set; }
        public int? PageSize { get; set; }
    }
}
