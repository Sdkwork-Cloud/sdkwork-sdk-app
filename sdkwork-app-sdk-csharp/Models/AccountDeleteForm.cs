using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AccountDeleteForm
    {
        public string? Password { get; set; }
        public string? Reason { get; set; }
        public bool? Confirm { get; set; }
        public int? Timestamp { get; set; }
    }
}
