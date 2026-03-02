using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CheckItem
    {
        public string? Type { get; set; }
        public string? TargetId { get; set; }
    }
}
