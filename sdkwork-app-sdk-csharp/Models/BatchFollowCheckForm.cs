using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class BatchFollowCheckForm
    {
        public List<string>? UserIds { get; set; }
        public string? CheckType { get; set; }
    }
}
