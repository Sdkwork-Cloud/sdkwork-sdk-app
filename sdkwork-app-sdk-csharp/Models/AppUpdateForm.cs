using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AppUpdateForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? AccessUrl { get; set; }
    }
}
