using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AddCartItemForm
    {
        public int? SkuId { get; set; }
        public int? ProductId { get; set; }
        public int? Quantity { get; set; }
        public string? CartGroupUuid { get; set; }
    }
}
