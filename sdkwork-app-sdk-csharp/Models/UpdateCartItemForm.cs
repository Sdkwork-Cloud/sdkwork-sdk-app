using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UpdateCartItemForm
    {
        public int? Quantity { get; set; }
    }
}
