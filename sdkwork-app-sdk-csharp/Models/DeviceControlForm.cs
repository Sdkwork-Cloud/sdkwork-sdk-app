using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DeviceControlForm
    {
        public string? Action { get; set; }
        public Dictionary<string, object>? Params { get; set; }
    }
}
